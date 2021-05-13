public int countPrimes(int n) {
	int i = 2, count = 0;
	boolean[] isPrimes = new boolean[n];
	Arrays.fill(isPrimes, true);

	while(i < n){
		if(isPrimes[i]){
			count++;
			for(int j = 2; i*j < n; j++){
				isPrimes[i*j] = false;
			}
		}
		i++;
	}
	return count;
}
