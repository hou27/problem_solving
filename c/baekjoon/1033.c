#include<stdio.h>
#include<malloc.h> 

// 1033 칵테일
// 아직 못 품
long GCD(int a, int b);

int LCM(int a, int b);

void main() {
	int N;
	int material[10][4];

	scanf("%d", &N);
	// material = (int*)malloc(sizeof(int) * N);
	// for (int i = 0; i < N; i++) {
	// 	material[i] = (int*)malloc(sizeof(int) * 2);
	// }
	for (int i = 0; i < N - 1; i++) {
		int a, b, p, q;

		scanf("%d %d %d %d", &a, &b, &p, &q);

		int gcd = (int)GCD(p, q);
		material[i][0] = a;
		material[i][1] = b;
		material[i][2] = p / gcd;
		material[i][3] = q / gcd;
	}
	for (int location = 0; location < N; location++) {
		for (int i = 1; i < N; i++) {
			if (material[i][0] == material[location][0] || material[i][1] == material[location][0]) {
				int here = 0, lcm;
				if (material[i][1] == material[location][0]) here = 1;
				lcm = LCM(material[i][here + 2], material[location][2]);
				material[location][3] = (lcm / material[location][2]) * material[location][3];
				material[location][2] = lcm;
				if (material[i][1] == material[location][0]) {
					material[i][2] = (lcm / material[i][3]) * material[i][2];
					material[i][3] = lcm;
				}
				else {
					material[i][3] = (lcm / material[i][2]) * material[i][3];
					material[i][2] = lcm;
				}
			}
			else if (material[i][0] == material[location][1] || material[i][1] == material[location][1]) {
				int here = 0, lcm;
				if (material[i][1] == material[location][1]) here = 1;
				lcm = LCM(material[i][here + 2], material[location][3]);
				material[location][2] = (lcm / material[location][3]) * material[location][2];
				material[location][3] = lcm;
				if (material[i][1] == material[location][1]) {
					material[i][2] = (lcm / material[i][3]) * material[i][2];
					material[i][3] = lcm;
				}
				else {
					material[i][3] = (lcm / material[i][2]) * material[i][3];
					material[i][2] = lcm;
				}
			}
		}
	}



	// for (;;) {
	// 	int location = 0;
	// 	int tmpMaterial[2][4];

	// 	tmpMaterial[0][0] = material[location][0];
	// 	tmpMaterial[0][1] = material[location][1];
	// 	tmpMaterial[0][2] = material[location][2];
	// 	tmpMaterial[0][3] = material[location][3];
	// 	for (int i = location + 1; i < N; i++) {
	// 		// material[i][0]==tmpMaterial[0][0]
	// 		// material[i][0]==tmpMaterial[0][1]
	// 		// material[i][1]==tmpMaterial[0][0]
	// 		// material[i][1]==tmpMaterial[0][1]
	// 		if (material[i][0] == tmpMaterial[0][0] || material[i][1] == tmpMaterial[0][0]) {
	// 			int here = 0, lcm;
	// 			if (material[i][1] == tmpMaterial[0][0]) here = 1;
	// 			lcm = LCM(material[i][here + 2], tmpMaterial[0][2]);

	// 		}
	// 		else if (material[i][0] == tmpMaterial[0][1] || material[i][1] == tmpMaterial[0][1]) {
	// 			int here = 0;
	// 			if (material[i][1] == tmpMaterial[0][1]) here = 1;
	// 		}
	// 	}
	// }

	for (int i = 0; i < N; i++) {
		if (material[i][0] == i) printf("%d ", material[i][0]);
		else if (material[i][1] == i) printf("%d ", material[i][1]);
	}
}

long GCD(int a, int b) {
	while (b > 0) {
		long temp = a;
		a = b;
		b = temp % b;
	}
	return a;
}

int LCM(int a, int b) {
	return a * b / GCD(a, b);
}