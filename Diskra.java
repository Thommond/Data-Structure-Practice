class Diskra {

  public static void diskra(int[][] graph, int source) {

    int len = graph.length;
    boolean[] visited = new boolean[len];
    int[] dist = new int[len];

    for (int i = 0; i < len; i++) {

      visited[i] = false;
      dist[i] = Integer.MAX_VALUE;

    }

    // setting source vertex zero
    dist[source] = 0;
    for (int i = 0; i < len; i++) {

      // Update next vertex from source
      int u = minDist(dist, visited);
      visited[u] = true;

      // Update all the next vertex dists
      for (int v = 0; v < len; v++) {

        if (!visited[v] && graph[u][v] != 0 && (dist[u] + graph[u][v] < dist[v])) {

          dist[v] = dist[u] + graph[u][v];
        }
      }
    }
    for (int i = 0; i < dist.length; i++) {

      System.out.println(String.format("dist from %s to %s is %s", source, i, dist[i]));
    }

  }

  // Finding the min dist
  static int minDist(int[] dist, boolean[] visited) {

    int minDist = Integer.MAX_VALUE;
    int minDistVertex = -1;

    for (int i = 0; i < dist.length; i++) {

      if (!visited[i] && dist[i] < minDist) {

        minDist = dist[i];
        minDistVertex = i;
      }

    }
    return minDistVertex;
  }

  public static void main(String[] args) {

    int graph[][] = new int[][] {

      // Used zeros because it does not count in algothrim anyway
      {0, 10, 5, 0, 0},
      {0, 0, 2, 1, 0},
      {0, 3, 0, 9, 2},
      {0, 0, 0, 0, 4},
      {7, 0, 0, 6, 0}
    };

    Diskra g = new Diskra();

    // Finding shortest distance
    g.diskra(graph, 0);
  }
}
