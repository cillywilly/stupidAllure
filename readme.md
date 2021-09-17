## **неправильнный словарь Auto AQ**

description : создан простаком

### общие


**`Java`** - язык программирования. требуется установить на комп одну из версий. сейчас распространена 1.8, последняя
поддерживаемая 1.11 (их называют просто 8 и 11 соответственно)

**`Idea`** - программа для разработки приложения. в платную версию сразу включены расширенные возможности работы с базой и тд. и тп.   

**`Проект`** - папка с файлами в расширении .java в папке src. для того что бы идея нормально поняла проект нужно ей "указать" корневую папку (в которой есть файл pom.xml если проект использует maven)  

**`maven` / `gradle`** - программа для сборки проекта и усправления зависимостями. требуется устновить на комп. в проекте ограничивается файлом pom.xml в корне     

**`обычная структура проекта`** - в любой папке->.idea(папка) pom.xml .gitignore(файл) src.  в src->main test. в них обеих->java resources. в main приложение в test соответственно тесты    

**`юнит тесты`** - тесты которые проверяют работу приложения (внутри) во время сборки приложения. тип у тя есть метод который принимает int и возвращает соответствующий String. в юнит тесте ты кидаешь в этот метод int  и проверяешь String на выходе

**`таргет`** - папка в которую обычно maven компилирует файлы.java в файлы.class. или сразу собирает в архив типа .jar .war  

**`компиляция`** - процесс перевода java кода в byte код.  

**`API`** - https://habr.com/ru/post/464261/. у всего есть апи. у яндекса есть эндпоинт/адрес/url при обращении к торогому с запросом get этот андпоинт возвращает http документ. ты можешь открыть этот документ и увидеть страницу адреса     

**`rest`** - https://habr.com/ru/post/483202/ тут несколько статей, на верху страницы ссылки на них. я бы это назвал системой(архитектурный стиль). в ней вся хуйня(приложения, сервисы, бэк с фронтом) обменивается со всей остальной хуйней текстовыми файлами в формате .json.

**`soap`** - те же яйца только в профиль. я слышал что безопаснее. вроде если одна сторона изменит содержание файла вторая об этом узнает автоматически. при rest если не предупредить разраба нихуя не сработает

**`json`** - распространенный формат файла для передачи сообщения по http. в нем все в фигурных скобках. хз че добавить. смысл в том что есть поле и есть значение {"a" : "b"}  - это уже жсон. а- поле. б - значение.

**`xml`** - примерно те же яйца только вид такой <a>b</a>. смысл тот же а - поле, б - значение.   

**`http`** - ну тут ваще хз. пользую знания только в плане кодов ошибок.  

**`библиотека (зависимотсть)`** - ты тупой. тебе надо преобразовать String в .xml и там совершить действия в коде или наоборот. ты подключаешь зависимость/библиотеку в мавене, у тебя появляется возможность использовать методы из этой библотеки. ты передаешь в метод из этой библиотеки свой String получаешь .xml  

**`репозитории библиотек`** - сервак на который разрабы скинули свои библотеки. есть пупличные, есть корпоративные. ты подключаешь зависимость через maven/gradle они ее сами скачивают к тебе в папку .m2 . бывают закрытые репозитории, что бы туда попасть в папке .m2 есть файл settings.xml в нем ты можешь указать адрес на закрытый репозиторий и лог пас для этого репозитория      

**`spring`** - хз. посмотри первые видосы Алишева по spring. штука подключая которую ты не пишешь классы, а описываешь их через аннотации. в ней много разного, я трогал spring boot - он заточен на разработку бэк приложения  

**`stub/mock`**  - заглушка. возвращает при обращении к ней заранее заданный ответ. у тя есть приложение которое 

**`конфигуратор`** - у idea есть функция через которую ты можешь запустить приложение. в конфигураторе ты можешь передать аргументы для твоего приложения, которые ты предварительно уже готов использовать в приложении. физически это меню между build и run. конфигурация запуска задается в кнопке Edit Configurations       

**`паттерн MVC`** - https://javarush.ru/groups/posts/2536-chastjh-7-znakomstvo-s-patternom-mvc-model-view-controller - мне было сложно понять. есть модель - бд. есть вид(view) - js-фронт проект. есть контроллер - java-бэк проект. js обращается по rest  к java. java обращается по sql к бд и возвращает результаты js-у    

**`строка запуска`** - в ней ты пишешь. что запускать, на какой версии java, параметры запуска, и classpath  

**`classpath`** - огромная строка в которой написано какие библиотеки ты подлючил. идея (или мавен) ее пишет за тебя     

**`Doker`** - программа которая позволяет быстро настраивать и создавать виртуальные машины(контейнеры) из image(файл который описывает операционную систему и что в ней должно быть). магия - не меньше не больше     

**`контейнер`** - виртуальная машина, часто без интерфейса, просто с командной строкой  

**`CRM`** - бд в которой хранится инфа о клиентах и все что к ней прикручено для того что бы сотрудник компании (к примеру банка) мог узнавать об услугах клиента и продавать ему новые услуги     

**`SQL`** -  язык бля общения с бд. есть и другие варинаты. нужен что бы сложно фильтровать бд и\или производить действия с данными в бд

**`базы данных(бд)`** - область памяти в которой хранятся данные. устанавливает на комп как приложение. при установке настраиваются параметры подключения к этой области памяти. типа адрес, логин пароль, порт    

**`приложение для доступа и работы в БД`** - их много, что бы подключиться к бд нужно настроить к ней подключение. в одном приложении может быть несколько коннектов к разным базам. к одной базе можно подключиться из разных приложений. мне нравится приложение dbeaver(бобер)   

**`Git`** - система контроля версий файлов. тип мы двое работаем над одним текстовым файлом (.doc или .java не важно). что бы было норм мы подключаем этот файл к git и выкладываем на удаленный репозиторий (gitHUb gitLab Bitbucket). скачиваем одинаковый файл каждый на свой комп. каждый со своей скачанной версией делает штуки. git следит в что мы сделали с каждым символом в каждой строке. по окончании работы мы делаем commit, гит кладет эту версию файла в локальный репозиторий. каждый делает push. гит выкладывает этот файл на удаленный репозиторий и сравнивает.

**`GitLab / Bitbucket`** - надстройка над гит которая дает UI над удаленным репозиторием гита.    

**`Apache / Nginx`** приложение которое устанавливается на сервер (сервером можно считать любой комп) для того что бы развернуть (задеплоить) приложение по определенному адресу на апределенном порте. типа ya.ru:8080 а уже в приложении уже описано что возвращать на какие запросы на какие адреса. типа get запрос на ya.ru:8080/kusai_mou_zal/ вернет http документ который  браузер автоматом нарисует     

**`jenkins / teamCity`**  приложение которое делает штуки над твоим приложением перед развертыванием\запуском. может все и еще чуть чуть

**`дебаг`** - режим работы приложения с возможностью остановиться на любой строчке и посмотреть че происходит и даже изменить какие нить значения переменных, запускается в идее

**`брейкПоинт`** - точка на которой остановится работа приложения в дебаге 

**`паттерн`** - правило/рекомендация которое придумали умные люди для решения распространенных задач  

###qa
**`selenium / webDriver`** - физически ты будешь использовать библиотеку, которая дает возможность управлять браузером из кода   

**`chromeDriver`** - эт отдельная приложуха которую (как вариант) кладут в корень. в коде указывают к chromedriver адрес и переменная класса WebDriver запускает через нее драйвер. есть драйверы и для других браузеров    

**`selenoid`** - надстройка над докером. часто используется для того что бы запускать простенькие контейнеры для браузера и дает возможность подключиться к ней и даже взаимодействовать с браузером. если изъебнуться можно поставить брейкпоинт, подлючиться к контейнеру и посмотреть че там  

**`pageObject`** - паттерн который опеределяет как разделять проект на классы. к примеру одна страница = 1 класс  

**`restAssured`** - библиотека которая дает удобные методы для отпаравки запросов на эндпоинты. даешь ей String она его отправляет, "показывает" о твет и дает возможность его обработать   

**`junit / testNg`** - физически эт аннотации в проекте, которые ты проставляешь над классами и/или методами. тип что выделить как тест, что выделить как шаг теста. что сделать перед/после каждого теста  

**`surefire`** - плагин который ты подключаешь в pom.xml и он запоминает результаты тестов, для этого шурфаер использует аспектЖ    

**`aspectJ`** - зависимость которую подключают к шурфаеру. работает параллельно с работой проекта, по этому если один из тестов упал (не прошел. результат отличается от ожидания) проект продолжает работать и в конце выдает результаты о всех тестах  

###tsk
**`page factory`** - фреймворк в который оборачивает вебДрайвер и еще другие штуки, то есть ты сам не создаешь драйвер, а запускаешь через методы пейджФактори и даешь с ним штуки. есть удобство есть проблемки       

**`siebel`** - ВРОДЕ эт язык для разработки сложной CRM, тип бекэнд. 

**`зибель тулз`** - по факту я использовал для : в CRM нашел поле, хочу найти его в БД, лезу в тулзы(зибельТулз)   и там ищу это поле. и связи этой таблицы с другими

