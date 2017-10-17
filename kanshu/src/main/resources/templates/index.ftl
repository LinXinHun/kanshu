<script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>

<div>
    <B>小说-此处应该低调</B><br>
    <span id="title"></span>
</div>

<script>
    $.get("http://novel.juhe.im/book-info/5816b415b06d1d32157790b1", function (data) {
        //http://novel.juhe.im/
        $("#title").text(JSON.stringify(data));
    })
</script>