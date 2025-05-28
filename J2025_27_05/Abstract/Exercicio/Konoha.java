package J2025_27_05.Abstract.Exercicio;

public class Konoha {
    public static void main(String[] args) {
        ClaUchiha uchiha = new ClaUchiha();
        ClaHyuuga hyuuga = new ClaHyuuga();
        ClaNara nara = new ClaNara();
        ClaAkimichi akimichi = new ClaAkimichi();

        Cla[] clans = new Cla[]{uchiha, hyuuga, nara, akimichi};
        for (Cla cla : clans) {
            System.out.println("\n============================");
            cla.exibirDetalhes();
            cla.habilidadeEspecial();
        }
    }
}
