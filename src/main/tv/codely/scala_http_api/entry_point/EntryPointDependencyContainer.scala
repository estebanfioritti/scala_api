package tv.codely.scala_http_api.entry_point

import tv.codely.scala_http_api.entry_point.controller.movcta.MovCtaController
import tv.codely.scala_http_api.entry_point.controller.status.StatusGetController
import tv.codely.scala_http_api.entry_point.controller.user.{UserGetController, UserPostController}
import tv.codely.scala_http_api.entry_point.controller.video.{VideoGetController, VideoPostController}
import tv.codely.scala_http_api.module.movcta.infrastructure.dependency_injection.MovCtaModuleDependencyContainer
import tv.codely.scala_http_api.module.user.infrastructure.dependency_injection.UserModuleDependencyContainer
import tv.codely.scala_http_api.module.video.infrastructure.dependency_injection.VideoModuleDependencyContainer

final class EntryPointDependencyContainer(
    userDependencies: UserModuleDependencyContainer,
    videoDependencies: VideoModuleDependencyContainer,
    movCtaDeudorDepencies: MovCtaModuleDependencyContainer
) {
  val statusGetController = new StatusGetController

  val movCtaController = new MovCtaController(movCtaDeudorDepencies.movctaSearcher)

  val userGetController  = new UserGetController(userDependencies.usersSearcher)
  val userPostController = new UserPostController(userDependencies.userRegistrar)

  val videoGetController  = new VideoGetController(videoDependencies.videosSearcher)
  val videoPostController = new VideoPostController(videoDependencies.videoCreator)
}
