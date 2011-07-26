// matching against case classes 


case class StorybookCharacter(name: String)
   
def goldilocks1(character : StorybookCharacter) = character match {
      case c : StorybookCharacter => c.name 
      
      case _ => "who?"
    }

   
    println(goldilocks1(StorybookCharacter("Mama")))

  
    println(goldilocks1(StorybookCharacter("Papa")))

case class StorybookAction(verb: String, thing: String)

    val chairAction = StorybookAction("sitting", "chair")
 
// putting it all together

case class Story(who: StorybookCharacter, what: StorybookAction)


    def goldilocks2(expr: Any) : String = expr match {
      case c: StorybookCharacter => c.name + " said someones been "
      case a: StorybookAction => a.verb + " in my " + a.thing
      case s: Story => goldilocks2(s.who) + goldilocks2(s.what)
      
      case _ => "what?"
    }

   
    println(goldilocks2(StorybookAction("sitting", "chair")))
   
 val who = StorybookCharacter("mama")
 val what = StorybookAction("sitting", "chair")
    println(goldilocks2(Story(who, what)))

case class Storybook(story: List[Story])

def goldilocks3(expr: Any) : String = expr match {
  case c: StorybookCharacter => c.name + " said someones been "
  case a: StorybookAction => a.verb + " in my " + a.thing
  case s: Story => goldilocks2(s.who) + goldilocks2(s.what)
  case l: Storybook => if (l.isEmpty) "" else goldilocks3(l.)
  
  case _ => "what?"
}



