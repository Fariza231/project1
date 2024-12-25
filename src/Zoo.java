import java.util.ArrayList;

public class Zoo {
    private String name;
    private ArrayList<ZooKeeper> zooKeepers;

    public Zoo(String name) {
        this.name = name;
        this.zooKeepers = new ArrayList<>();
    }

    public void addZooKeeper(ZooKeeper zooKeeper) {
        zooKeepers.add(zooKeeper);
    }

    public void displayZooInfo() {
        System.out.println("Zoo: " + name);
        System.out.println("ZooKeepers and their animals:");
        for (ZooKeeper zooKeeper : zooKeepers) {
            zooKeeper.displayKeeperInfo();
            System.out.println();
        }
    }
}
