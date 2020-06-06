<div class="container">
  <h2>${board} form</h2>
  <form action="./noticeWrite" method="post">
    <div class="form-group">
      <label for="num">Num:</label>
      <input type="text" class="form-control" id="id" placeholder="Enter num" name="num">
    </div>
    
    <div class="form-group">
      <label for="title">Title:</label>
      <input type="text" class="form-control" id="title" placeholder="Enter Title" name="title">
    </div>
    
    <div class="form-group">
      <label for="writer">Writer:</label>
      <input type="text" class="form-control" id="writer" placeholder="Enter Writer" name="writer">
    </div>
    
    <div class="form-group">
  		<label for="contents">Contents:</label>
  		<textarea class="form-control" rows="5" placeholder="Enter Contents" id="contents" name="contents"></textarea>
	</div>
    
    <button type="submit" class="btn btn-default">Write</button>
  </form>
</div>