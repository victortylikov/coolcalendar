function displayPrevMonth(days, lastDay) {
    var container1 = document.getElementById("tableBody")
    for (i = 1; i <= days; i++) {
        var blockDiv1 = document.createElement("div");
        blockDiv1.className = "day";
        blockDiv1.append(i);
        container1.appendChild(blockDiv);
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