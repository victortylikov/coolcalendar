var modal = document.getElementById('event-modal-id');
modalCloseButton = document.getElementById('modal-close-button');

window.addEventListener('load', function(){
    var days = document.getElementsByClassName("day");
    for (var i=0; i < days.length; i++) {
      days[i].addEventListener('click', openEventDialog, false);
    }
});

window.onclick = function(event) {
    if (event.target == modal) {
        modal.style.display = "none";
    }
};

var openEventDialog = function() {
    modal.style.display = "block";
};

modalCloseButton.onclick = function() {
    modal.style.display = "none";
}
