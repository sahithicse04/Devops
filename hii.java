sudo apt update
sudo apt install git
git --version
git config --global user.name "your username"
git config --global user.email "your email"
git config --list
-----create a folder now----
pwd
mkdir <-foldername->
cd <-folder name->
------colne the repo-----
git clone <-repo link->
ls
cd <-goto repo folder->
---------creating file and pushing to origin-----

touch <-filename->.java
gedit <-filename->.java
It opens editor write the code after writing 
git status
git add <-filename->.java
git commit -m "inital commit"
git push origin main
git remote set-url origin https://<username>:<personal_access_token>@github.com/<username>/<repository>.git








1) docker --version
2) sudo docker login
3) sudo docker login -u <username>
4) sudo docker pull mysql 
5) sudo docker run --name mysql -e MYSQL_ALLOW_EMPTY_PASSWORD=yes -d mysql 
6) sudo docker ps -a
7) sudo docker ps
8) sudo docker stop <container_id or container name>
9) sudo docker rm <container_id or container name>
10) sudo docker rmi mysql

java-image
hi.java
public class hi{
public static void main(String args[]){
System.out.println("hello");
}
}
Dockerfile
FROM openjdk
WORKDIR /app
COPY ./app
RUN javac hi.java
CMD ["java","hi"]

javac hi.java
java hi
sudo docker build -t sahithi .
sudo docker run --sahithi







minikube start
minikube status(Running)
minikube ip
kubectl cluster -info
kubectl get deployments(shows all deployments)
if present delete 
kubectl delete deployment (nginx)
kubectl create deployment (nginx) --image=nginx
kubectl get services 
If present delete 
kubectl delete service (nginx)
kubectl expose deployment nginx --port=80 --type=NodePort
kubectl get pods (Running)
minikube service nginx --url
If running above url will open(welcome to nginx)
minikube dashboard
minikube stop






Main.java
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; import org.openqa.selenium.WebElement; 
import org.openqa.selenium.chrome.ChromeDriver; 
public class Main { 
public static void main(String[] args) throws Exception { System.out.println("Starting 
Selenium program..."); WebDriver driver 
= new ChromeDriver(); 
try { 
driver.get("https://www.google.com"); System.out.println("Opened Google 
homepage."); 
WebElement searchBox = driver.findElement(By.name("q")); 
searchBox.sendKeys("Selenium WebDriver tutorial"); searchBox.submit();     
System.out.println("Performed search operation."); 
Thread.sleep(2000); 
String pageTitle = driver.getTitle(); System.out.println("Title of the results page: " + 
pageTitle); 
} finally { driver.quit(); 
System.out.println("Browser closed. Program completed."); 
} 
} 
} 
Execution Commands 
1.Compile the Code: 
javac -cp ".:lib/*" Main.java 
2.Run the Program: 
java -cp ".:lib/*" Main






test.js
const { Builder, By, Key } = require('selenium-webdriver'); 
async function example() { 
let driver = await new Builder().forBrowser('chrome').build(); try { 
// Navigate to Google 
await driver.get('https://www.google.com'); console.log('Opened Google homepage.'); 
// Find the search box and perform a search 
let searchBox = await driver.findElement(By.name('q')); 
await searchBox.sendKeys('Selenium WebDriver', Key.RETURN); console.log('Search 
performed successfully.'); 
} finally { 
34 
Experiment No:        
// Close the browser await driver.quit(); console.log('Browser closed.'); 
} 
}example(); 
Execution Commands: 
1.Install Dependencies: 
npm init -y 
npm install selenium-webdriver chromedriver 
2.Run the Script: 
node test.js
