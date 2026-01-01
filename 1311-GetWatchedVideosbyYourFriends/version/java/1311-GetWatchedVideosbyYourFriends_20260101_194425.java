// Last updated: 01/01/2026, 19:44:25
1class Solution {
2    public List<String> watchedVideosByFriends(final List<List<String>> watchedVideos, final int[][] friends, final int id, int level) {
3        final Queue<Integer> queue = new LinkedList<>();
4        final boolean[] explored = new boolean[friends.length];
5
6        queue.offer(id);
7
8        explored[id] = true;
9
10        while(!queue.isEmpty() && level > 0) {
11            final int size = queue.size();
12
13            for(int i = 0; i < size; ++i) {
14                int idx = queue.poll();
15
16                for(final int friend : friends[idx]) {
17                    if(!explored[friend])
18                        queue.offer(friend);
19
20                    explored[friend] = true;
21                }
22            }
23
24            level--;
25        }
26
27        final Map<String, Integer> count = new HashMap<>();
28
29        while(!queue.isEmpty()) {
30            final int idx = queue.poll();
31
32            for(final String video : watchedVideos.get(idx))
33                count.put(video, count.getOrDefault(video, 0) + 1);
34        }
35
36        final List<String> watched = new ArrayList<>();
37
38        for(final String video : count.keySet())
39            watched.add(video);
40
41        Collections.sort(watched, (a, b) -> count.get(a) == count.get(b) ? a.compareTo(b) : count.get(a) - count.get(b));
42
43        return watched;
44    }
45}