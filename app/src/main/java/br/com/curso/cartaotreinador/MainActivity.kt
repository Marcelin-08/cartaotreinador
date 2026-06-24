@Composable
fun ModernTrainerCard() {
    // 1. Cria um belo gradiente vertical noturno para o fundo
    val backgroundGradient = Brush.verticalGradient(
        colors = listOf(Color(0xFF0F0C29), Color(0xFF302B63), Color(0xFF24243E))
    )

    // 2. Box cobrindo toda a tela com o gradiente
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(backgroundGradient),
        contentAlignment = Alignment.Center
    ) {
        // 3. Cartão centralizado branco levemente translúcido
        Card(
            modifier = Modifier
                .padding(20.dp)
                .fillMaxWidth()
                .shadow(elevation = 30.dp, shape = RoundedCornerShape(32.dp)),
            shape = RoundedCornerShape(32.dp),
            colors = CardDefaults.cardColors(containerColor = Color.White.copy(alpha = 0.95f))
        ) {
            Column(
                modifier = Modifier.padding(24.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                // Aqui ficarão os itens internos do cartão!
            }
        }
    }
}
