module serviceloader.messagesupplier {
    exports com.airhacks.serviceloader;
    provides com.airhacks.serviceloader.Messenger with com.airhacks.serviceloader.FriendlyMessenger;
}
