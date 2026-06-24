function postMessage() {
    const name = document.getElementById("nameInput").value;
    const text = document.getElementById("textInput").value;

    if (name === "" || text === "") return; // 空なら何もしない

    const board = document.getElementById("board");
    const div = document.createElement("div");
    div.className = "post";
    div.innerHTML = `<strong>${name}</strong>: ${text}`;
    
    board.prepend(div); // 新しい投稿を一番上に追加

    // 入力欄をクリア
    document.getElementById("textInput").value = "";
}