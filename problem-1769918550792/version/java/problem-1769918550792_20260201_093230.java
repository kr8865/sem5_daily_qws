// Last updated: 01/02/2026, 09:32:30
1class RideSharingSystem {
2    Queue<Integer> rider;
3    Queue<Integer> driver;
4    HashSet<Integer> active;
5
6    public RideSharingSystem() {
7        rider=new LinkedList<>();
8        driver=new LinkedList<>();
9        active=new HashSet<>();
10        
11    }
12    
13    public void addRider(int riderId) {
14        
15        rider.add(riderId);
16        active.add(riderId);
17        
18    }
19    
20    public void addDriver(int driverId) {
21        driver.add(driverId);
22        
23    }
24    
25    public int[] matchDriverWithRider() {
26        int[] arr=new int[2];
27        Arrays.fill(arr,-1);
28        while(!rider.isEmpty() && !active.contains(rider.peek())){
29            rider.poll();
30        }
31        if(rider.isEmpty() || driver.isEmpty()){
32            return arr;
33        }
34        arr[0]=driver.remove();
35        arr[1]=rider.remove();
36        active.remove(arr[1]);
37        return arr;
38        
39    }
40    
41    public void cancelRider(int riderId) {
42        if(active.contains(riderId)){
43            active.remove(riderId);
44        }
45        
46    }
47}
48
49/**
50 * Your RideSharingSystem object will be instantiated and called as such:
51 * RideSharingSystem obj = new RideSharingSystem();
52 * obj.addRider(riderId);
53 * obj.addDriver(driverId);
54 * int[] param_3 = obj.matchDriverWithRider();
55 * obj.cancelRider(riderId);
56 */