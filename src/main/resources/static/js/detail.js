console.log("index.js");

$(document).ready(function(){
    loadContactList();
});

function get(name){
    if(name=(new RegExp('[?&]'+encodeURIComponent(name)+'=([^&]*)')).exec(location.search))
        return decodeURIComponent(name[1]);
}

function loadContactList() {
    $.ajax({
        type: "GET",
        url: '/contact?id='+get('id'),
        data: {},
        success: function (data) {
            console.log(data);
            $('#email').html(data['email']);
            $('#full_name').html(data['full_name']);
            $('#type').html(data['type']);
            $('#phone_number').html(data['phone_number']);
            $('#address').html(data['address']);
        }
    });
}