$(document).ready(function () {
    dropDownCom();
});

let dropDownCom = function () {
    $.ajax({
        url: "/api/Computer/all",
        type: 'GET',
        dataType: 'json',
        success: function (respuesta) {
            let select = document.getElementById("selectCom");

            for (let i = 0; i < respuesta.length; i++) {
                let opt = respuesta[i].name;
                let cod = respuesta[i].id;
                let el = document.createElement("option");
                el.text = opt;
                el.value = cod;
                select.add(el);
            }
        },
        error: function (xhr, status) {
            alert('ha sucedido un problema');
        },
        complete: function (xhr, status) {
            console.log(status);
        }
    });
}

