/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
$(document).ready(function() {

    $('#nomAdmin').focus();
    $("#fechaNacimiento").val($.datepicker.formatDate('dd/mm/yy', new Date(2000, 01, 01)));
    $("#fechaNacimiento").datepicker({yearRange: "1945:2024"});

    obtenerPaises();
// obteniendo departamento
    $("#pais").change(function() {
        var idPais = $("#pais option:selected").val();
        $("#idPais").val(idPais);
        $("#idDepartamento").val('00');
        $("#idProvincia").val('00');
        $("#idDistrito").val('00');
        obtenerDepartamento(idPais);
    });
// obteniendo provincias
    $("#departamento").change(function() {
        var idPais = $("#pais option:selected").val();
        var idDepartamento = $("#departamento option:selected").val();
        $("#idDepartamento").val(idDepartamento)
        $("#idProvincia").val('00')
        $("#idDistrito").val('00')

        obtenerProvincias(idPais, idDepartamento);
    });
// obteniendo distritos
    $("#provincia").change(function() {
        var idPais = $("#pais option:selected").val();
        var idDepartamento = $("#departamento option:selected").val();
        var idProvincia = $("#provincia option:selected").val();
        $("#idDistrito").val('00')
        $("#idProvincia").val(idProvincia)
        obtenerDistritos(idPais, idDepartamento, idProvincia);
    });

    $('#btnGuardar').click(function() {
        // cargarDatosTelefono();
        $('#frmDatosInstructor').submit();
    });
    $("#msg-error").hide();
});

function obtenerPaises() {
    $(function() {
        $.ajax({
            url: 'obtenerPais.html',
            async: false,
            success: function(data) {
                var DOM = "";
                $("#departamento").empty().append("<option value='0'>Seleccione uno</option>");
                $("#provincia").empty().append("<option value='0'>Seleccione uno</option>");
                $("#distrito").empty().append("<option value='0'>Seleccione uno</option>");
                var pais = $("#idPais").val();
                $.each(data, function(i, p) {
                    if (p.codigo != pais) {
                        DOM = DOM + "<option value='" + p.codigo + "'>" + p.nombre + "</option>";
                    } else {
                        DOM = DOM + "<option selected='selected' value='" + p.codigo + "'>" + p.nombre + "</option>";
                    }
                });
                $("#pais").append(DOM);
                if (pais != null && pais != 0) {
                    obtenerDepartamento(pais);
                }
            }
        });
    });
}
function obtenerDepartamento(idPais) {

    $(function() {
        $.ajax({
            url: 'obtenerDepartamentos.html',
            data: {codPais: idPais},
            async: false,
            success: function(data) {
                $("#departamento").empty().append("<option value='0'>Seleccione uno</option>");
                $("#provincia").empty().append("<option value='0'>Seleccione uno</option>");
                $("#distrito").empty().append("<option value='0'>Seleccione uno</option>");
                var departamento = $("#idDepartamento").val();
                $.each(data, function(i, p) {
                    if (p.codigo != departamento) {
                        $("#departamento").append("<option value='" + p.codigo + "'>" + p.nombre + "</option>");
                    } else {
                        $("#departamento").append("<option selected='selected' value='" + p.codigo + "'>" + p.nombre + "</option>");
                    }
                });
                if (idPais != null && idPais != 0 && departamento != null && departamento != 0) {
                    obtenerProvincias(idPais, departamento);
                }
            }
        });
    });
}

function obtenerProvincias(idPais, idDepartamento) {
    $("#provincia").empty();
    $.ajax({
        url: 'obtenerProvincias.html',
        data: {codPais: idPais,
            codDepartamento: idDepartamento},
        async: false,
        success: function(data) {
            $("#provincia").empty().append("<option value='0'>Seleccione uno</option>");
            $("#distrito").empty().append("<option value='0'>Seleccione uno</option>");
            var provincia = $("#idProvincia").val();
            $.each(data, function(i, p) {
                if (p.codigo != provincia) {
                    $("#provincia").append("<option value='" + p.codigo + "'>" + p.nombre + "</option>");
                } else {
                    $("#provincia").append("<option  selected='selected' value='" + p.codigo + "'>" + p.nombre + "</option>");
                }
            });
            if (idPais != null && idPais != 0 && idDepartamento != null && idDepartamento != 0 && provincia != null && provincia != 0) {
                obtenerDistritos(idPais, idDepartamento, provincia);
            }
        }
    });
}

function obtenerDistritos(idPais, idDepartamento, idProvincia) {
    $("#distrito").empty();
    $.ajax({
        url: 'obtenerDistritos.html',
        data: {codPais: idPais,
            codDepartamento: idDepartamento,
            codProvincia: idProvincia},
        async: false,
        success: function(data) {
            $("#distrito").empty().append("<option value='0'>Seleccione uno</option>");
            var distrito = $("#idDistrito").val();
            $.each(data, function(i, p) {
                if (p.codigo != distrito) {
                    $("#distrito").append("<option value='" + p.codigo + "'>" + p.nombre + "</option>");
                } else {
                    $("#distrito").append("<option  selected='selected' value='" + p.codigo + "'>" + p.nombre + "</option>");
                }
            });
        }
    });
}

function llenarUsuario() {
    var nombre = $("#nomAdmin").val();
    var apeP = $("#primerApellido").val();
    var apeM = $("#segundoApellido").val();
    var usuTemporal = "";
    if (nombre.length > 0 && apeP.length > 0) {
        if (apeP.length > 7) {
            apeP = apeP.substr(0, 8);
        }
        usuTemporal = nombre.substr(0, 1) + apeP + apeM.substr(0, 1);
        $("#nomUser").val(usuTemporal.noSpace().toLowerCase());
    }
}
