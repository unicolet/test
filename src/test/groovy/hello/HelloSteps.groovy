package hello

this.metaClass.mixin(cucumber.api.groovy.Hooks)
this.metaClass.mixin(cucumber.api.groovy.EN)

Before() {
    program = new Program()
}

Given(~/^It meets (\w+)$/) { String name ->
    person = new Person(name)
}

Then(~/^It should say (.*)$/) { String greeting ->
    assert greeting == program.greet(person)
}