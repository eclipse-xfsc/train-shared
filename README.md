# train-shared

## Description
This repository contains java code shared between several TRAIN projects and used as Git Submodules. The project cannot share same `pom.xml` file as it suppose to be included in different parent projects, but any project who use it should add a custom `xyz-pom.xml` file where it can reference the right parent project. For instance, TCR project adds there `tcr-pom.xml` file and includes this repository as Maven module in Git Submodule `shared`:

```
    <modules>
        <module>api</module>
        <module>shared/tcr-pom.xml</module>
        <module>clients/java</module>
        <module>service</module>
    </modules>
```

## Authors and acknowledgment
The code is maintained by 
- [Sirish Kalubhai Savaliya](https://gitlab.eclipse.org/sirish1911)
- [Denis Sukhoroslov](https://gitlab.eclipse.org/dsukhoroslov)

## License
As part of the TRAIN project the software released under the [Apache 2.0 license](https://www.apache.org/licenses/LICENSE-2.0.html).


