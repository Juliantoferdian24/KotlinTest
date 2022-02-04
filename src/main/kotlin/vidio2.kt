//import javax.script.ScriptContext
//
//class EpisodeViewHolder(val binding: ItemEpisodeBinding) : RecyclerView.ViewHolder(binding.root) {
//
//    fun bind(episode: Episode) {
//        binding.titleView.text = episode.title
//
//        binding.downloadButton.isVisible = (episode.downloadStatus == NOT_DOWNLOADED)
//        binding.downloadButton.setOnClickListener {
//            /***
//             * TODO :
//             * 1. call vidioSDK : VidioSDK.downloadEpisode(episodeId: Long) in another thread so it won't block UI
//             * 2. when download in progress set `binding.progressView.isVisible = true`
//             * 3. when download finish set `binding.downloadButton.isVisible = false` `binding.progressView.isVisible = false`
//             *
//             * Notes :
//             * - Be carefull on accessing view in another thread, since recycleview can be recycled
//             */
//            GlobalScope.launch(Dispatchers.Main) {
//
//                // get the downloaded bitmap
//                val vidioSDK = async { VidioSDK.downloadEpisode(episode.id) }
//                when (episode.downloadStatus) {
//                    NOT_DOWNLOADED -> {
//                        binding.downloadButton.isVisible = true
//                        binding.progressView.isVisible = false
//                    }
//                    DOWNLOADING -> binding.progressView.isVisible = true
//                    DOWNLOAD_FINISH -> {
//                        binding.downloadButton.isVisible = false
//                        binding.progressView.isVisible = false
//                    }
//                }
//            }
//        }
//        Glide.with(context)
//            .load(episode.thumbnailUrl)
//            .into(binding.lytImage)
//    }
//}