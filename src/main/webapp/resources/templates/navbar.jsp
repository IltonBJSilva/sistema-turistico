<!-- Fixed navbar -->
<nav class="navbar navbar-default navbar-fixed-top">
	<div class="container">
		<div class="navbar-header">
			<button  style="color: blue" type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target="#navbar" aria-expanded="false"
				aria-controls="navbar">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="<%=request.getContextPath()%>/index.jsp#">Sistema
				de turismo para você</a>
		</div>
		<div id="navbar" class="collapse navbar-collapse">
			<ul class="nav navbar-nav">
				<li><a href="<%=request.getContextPath()%>/artista/listar">Pacote de viagem</a></li>
				<li><a href="<%=request.getContextPath()%>/filme/pesquisar">Valores</a></li>
				<li><a href="<%=request.getContextPath()%>/participacao/filmes">Pesquisar Hoteis</a></li>
			</ul>
		</div>
		<!--/.nav-collapse -->
	</div>
</nav>
