import java.util.LinkedList;
import java.util.Queue;

class RecentCounter {
    private Queue<Integer> queue;

    public RecentCounter() {
        queue = new LinkedList<>();
    }

    public int ping(int time) {
        queue.add(time);
        while (queue.peek() < time - 3000) {
            queue.poll();
        }
        return queue.size();
    }
}