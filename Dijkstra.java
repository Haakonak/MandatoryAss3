

public class Dijkstra {

    public void dijkstra(int[][] graph, int source) {
      int count = graph.length;
      boolean[] visitedVertex = new boolean[count];
      int[] distance = new int[count];
      for (int i = 0; i < count; i++) {
        visitedVertex[i] = false;
        distance[i] = Integer.MAX_VALUE;
      }
  
      distance[source] = 0;
      for (int i = 0; i < count; i++) {
  
        int u = findMinDistance(distance, visitedVertex);
        visitedVertex[u] = true;
  
        for (int v = 0; v < count; v++) {
          if (!visitedVertex[v] && graph[u][v] != 0 && (distance[u] + graph[u][v] < distance[v])) {
            distance[v] = distance[u] + graph[u][v];
          }
        }
      }
      for (int i = 0; i < distance.length; i++) {
        System.out.println(String.format("Lengden fra %s til %s er %s", source, i, distance[i]));
      }
  
    }
  
    private static int findMinDistance(int[] distance, boolean[] visitedVertex) {
      int minDistance = Integer.MAX_VALUE;
      int minDistanceVertex = -1;
      for (int i = 0; i < distance.length; i++) {
        if (!visitedVertex[i] && distance[i] < minDistance) {
          minDistance = distance[i];
          minDistanceVertex = i;
        }
      }
      return minDistanceVertex;
    }
  
    public static void main(String[] args) {
      int graph[][] = new int[][] { { 0, 10, 5, 9999, 3, 12 }, 
                                  { 10, 0, 17, 9, 17, 12 }, 
                                  { 5, 17, 0, 35, 3, 12 },
                                  { 9999, 9, 35, 0, 9999, 12 }, 
                                  { 3, 17, 3, 9999, 0, 12 }, 
                                  { 12, 12, 12, 12, 12, 0 } };
      Dijkstra T = new Dijkstra();
      System.out.println("Startpunkt A");
      T.dijkstra(graph, 0);
      System.out.println("Startpunkt B");
      T.dijkstra(graph, 1);
      System.out.println("Startpunkt C");
      T.dijkstra(graph, 2);
      System.out.println("Startpunkt D");
      T.dijkstra(graph, 3);
      System.out.println("Startpunkt E");
      T.dijkstra(graph, 4);
      System.out.println("Startpunkt F");
      T.dijkstra(graph, 5);
    }
  }