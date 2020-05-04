import seaborn as sns
from sklearn.linear_model import LinearRegression
import matplotlib.pyplot as plt
import numpy as np
dataFile = open("springData.txt", 'r')
distances = []
masses = []
dataFile.readline()
for line in dataFile:
    d, m = line.split()
    distances.append(float(d))
    masses.append(float(m))
dataFile.close()
sns.set()
m = np.array(masses)
d = np.array(distances)

model = LinearRegression(fit_intercept=True)
X = m[:, np.newaxis]
Y = d

model.fit(X, Y)
y_model = model.predict(X)

plt.scatter(X, Y)
plt.plot(X, y_model)
plt.show()
