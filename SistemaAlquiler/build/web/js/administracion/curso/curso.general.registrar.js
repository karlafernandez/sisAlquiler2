$(document).ready(function() {
    $('#nomCursoGeneral').focus();
    $('span[id*="errors"]').parents('div[class*="control-group"]').addClass('error');
     $("#listaCursoEspecifico").pickList({
        sourceListLabel: "Disponibles",
        targetListLabel: "Seleccionados",
        addAllLabel: "Agregar Todos",
        addLabel: "Agregar",
        removeAllLabel: "Quitar Todos",
        removeLabel: "Quitar",
        sortItems: false

    });
});