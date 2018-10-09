function myFunction(days) {
    for (i = 1; i <= days; i++) {
        var container = document.getElementById("mainContainer")
        var blockDiv = document.createElement("div");
        blockDiv.className = "day";
        blockDiv.append(i);
        container.append(blockDiv);
    }
}