document.addEventListener("DOMContentLoaded", function() {
    const repoOwner = "markziegler1";
    const repoName = "markziegler1/ExamPrepAll";
    const apiUrl = `https://api.github.com/repos/${repoOwner}/${repoName}/contents/`;

    fetch(apiUrl)
        .then(response => response.json())
        .then(files => {
            const fileList = document.getElementById("file-list");
            files.filter(file => file.name.endsWith(".java")).forEach(file => {
                const fileLink = document.createElement("a");
                fileLink.href = "#";
                fileLink.textContent = file.name;
                fileLink.addEventListener("click", () => {
                    fetchFileContent(file.path);
                });
                fileList.appendChild(fileLink);
            });
        })
        .catch(error => console.error("Error fetching files:", error));

    function fetchFileContent(filePath) {
        const fileUrl = `https://raw.githubusercontent.com/${repoOwner}/${repoName}/main/${filePath}`;
        fetch(fileUrl)
            .then(response => response.text())
            .then(content => {
                const fileContent = document.getElementById("file-content");
                fileContent.innerHTML = `<h2>${filePath}</h2><pre>${content}</pre>`;
            })
            .catch(error => console.error("Error fetching file content:", error));
    }
});
