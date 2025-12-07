public class MagicChairFactory implements ChairAbstractFactory {
    @Override public Chair createChair() { return new MagicChair(); }
}