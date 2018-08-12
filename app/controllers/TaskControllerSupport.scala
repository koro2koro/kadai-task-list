package controllers

import forms.TaskForm
import play.api.data.Forms._
import play.api.data._
import play.api.mvc.AbstractController

trait TaskControllerSupport {
  this: AbstractController =>

  protected val form = Form(
    mapping(
      "id"    -> optional(longNumber),
      "content"  -> nonEmptyText,
      "status" -> nonEmptyText(maxLength = 10),
    )
    (TaskForm.apply)(TaskForm.unapply)
  )

}