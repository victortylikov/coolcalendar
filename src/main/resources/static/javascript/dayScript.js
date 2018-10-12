document.getElementById("body").addEventListener("load", displayCurrentMonth(21));

function displayPrevMonth(days, lastDay) {
    var container = document.getElementById("tableBody")
    for (i = 1; i <= days; i++) {
        var blockDiv = document.createElement("div");
        blockDiv.className = "day";
        blockDiv.append(i);
        container.appendChild(blockDiv);
    }
}


function displayCurrentMonth(days) {
    var container = document.getElementById("tableBody")
    for (i = 1; i <= days; i++) {
        var blockDiv = document.createElement("div");
        blockDiv.className = "day";
        blockDiv.append(i);
        container.appendChild(blockDiv);
    }
}