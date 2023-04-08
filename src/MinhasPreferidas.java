public class MinhasPreferidas {
    public void inclui(Audio audio) {
        if (audio.getClassificao() >= 9) {
            System.out.println(audio.getTitulo() + " Excelente!");
        }
        System.out.println(audio.getTitulo() + " Ótimo");
    }
}
