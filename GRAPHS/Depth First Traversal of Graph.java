void DFSUtil(int v, boolean visited[], List<Integer> ls) {
    visited[v] = true;
    ls.add(v);

    List<Integer> neighbors = adjVertices.get(v);
    if (neighbors != null) {
        for (int it : neighbors) {
            if (!visited[it]) {
                DFSUtil(it, visited, ls);
            }
        }
    }
}

void DFS(int v) {
    boolean[] visited = new boolean[adjVertices.size()];
    ArrayList<Integer> ls = new ArrayList<>();

    DFSUtil(v, visited, ls);

    for (int node : ls) {
        System.out.print(node + " ");
    }
}
