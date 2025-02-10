package ContestsLC;

import java.util.*;

public class TaskManager {
    private PriorityQueue<List<Integer>> pq = new PriorityQueue<>(
            (task1, task2) -> {
                int priorityComparison = Integer.compare(task2.get(2), task1.get(2));
                if (priorityComparison == 0) {
                    return Integer.compare(task2.get(1), task1.get(1));
                }
                return priorityComparison;
            });

    private Map<Integer, List<Integer>> taskMap = new HashMap<>();

    public TaskManager(List<List<Integer>> tasks) {
        for (List<Integer> task : tasks) {
            pq.add(new ArrayList<>(task));
            taskMap.put(task.get(1), task);
        }
    }

    public void add(int userId, int taskId, int priority) {
        List<Integer> task = new ArrayList<>(Arrays.asList(userId, taskId, priority));
        pq.add(task);
        taskMap.put(taskId, task);
    }

    public void edit(int taskId, int newPriority) {
        List<Integer> task = taskMap.get(taskId);
        pq.remove(task);
        task.set(2, newPriority);
        pq.add(task);
    }

    public void rmv(int taskId) {
        List<Integer> task = taskMap.get(taskId);
        pq.remove(task);
        taskMap.remove(taskId);
    }

    public int execTop() {
        if (pq.isEmpty()) {
            return -1;
        }
        return pq.peek().get(0);
    }

    public static void main(String[] args) {

        TaskManager obj = new TaskManager(List.of(List.of(6, 5, 23)));
        System.out.println(obj.execTop());
        System.out.println(obj.execTop());
    }
}

/**
 * Your TaskManager object will be instantiated and called as such:
 * TaskManager obj = new TaskManager(tasks);
 * obj.add(userId,taskId,priority);
 * obj.edit(taskId,newPriority);
 * obj.rmv(taskId);
 * int param_4 = obj.execTop();
 * /*
 */

