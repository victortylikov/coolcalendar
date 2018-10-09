function myFunction(days) {
    var container = document.getElementById("tableBody")
    for (i = 1; i <= days; i++) {
        var blockDiv = document.createElement("div");
        blockDiv.className = "day";
        blockDiv.append(i);
        container.appendChild(blockDiv);
    }
}