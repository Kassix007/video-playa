.class public final Lcom/web2native/NotificationDisableBroadcastReceiver;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/web2native/NotificationDisableBroadcastReceiver$NotificationBroadcastReceiverListener;
    }
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field public notificationBroadcastReceiverListener:Lcom/web2native/NotificationDisableBroadcastReceiver$NotificationBroadcastReceiverListener;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/web2native/NotificationDisableBroadcastReceiver;->notificationBroadcastReceiverListener:Lcom/web2native/NotificationDisableBroadcastReceiver$NotificationBroadcastReceiverListener;

    .line 2
    .line 3
    if-eqz p1, :cond_1

    .line 4
    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p1, 0x0

    .line 13
    :goto_0
    const-string v0, "com.web2native.NOTIFICATION_DATA_RECEIVED"

    .line 14
    .line 15
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-eqz p1, :cond_1

    .line 20
    .line 21
    iget-object p1, p0, Lcom/web2native/NotificationDisableBroadcastReceiver;->notificationBroadcastReceiverListener:Lcom/web2native/NotificationDisableBroadcastReceiver$NotificationBroadcastReceiverListener;

    .line 22
    .line 23
    invoke-static {p1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    invoke-interface {p1, p2}, Lcom/web2native/NotificationDisableBroadcastReceiver$NotificationBroadcastReceiverListener;->onSuccess(Landroid/content/Intent;)V

    .line 27
    .line 28
    .line 29
    :cond_1
    return-void
.end method
