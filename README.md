# 🚀 Desafio - Abstraindo um Bootcamp
Desafio de abstração de bootcamp desenvolvido na plataforma DIO durante o Banco Pan Java Bootcamp.

---

### **📚 Classes**

* **Aluno**: Representação dos desenvolvedores que irão se matricular, participar dos bootcamps e realizar cursos.
  

* **Bootcamp**: Representação dos bootcamps que os alunos irão se matricular. Contém todos os matriculados bem como o status de conclusão do bootcamp individual de cada um.


* **Conteudo**: Representação _abstrata_ do conteúdo que os bootcamps irão possuir. Todo conteúdo possui título e descrição, bem como **_devem implementar o cálculo da experiência_** que os alunos irão receber.


* **Curso**: Representação de um _Conteudo_ de um bootcamp e possui sua determinada carga horária.


* **Mentoria**: Representação de um _Conteudo_ de um bootcamp e possui sua determinada data e hora que está agendada para ocorrer.