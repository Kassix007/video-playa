.class public final Lg5/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LR4/k1;

.field public final b:Landroid/app/DownloadManager;

.field public final c:Lorg/json/JSONObject;

.field public d:Ljava/lang/String;

.field public e:J

.field public f:Landroid/content/Intent;


# direct methods
.method public constructor <init>(LR4/k1;)V
    .locals 2

    .line 1
    const-string v0, "dataObject"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lg5/c;->a:LR4/k1;

    .line 10
    .line 11
    iget-object v0, p1, LR4/k1;->a:Lcom/web2native/MainActivity;

    .line 12
    .line 13
    const-string v1, "download"

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const-string v1, "null cannot be cast to non-null type android.app.DownloadManager"

    .line 20
    .line 21
    invoke-static {v0, v1}, Lkotlin/jvm/internal/m;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    check-cast v0, Landroid/app/DownloadManager;

    .line 25
    .line 26
    iput-object v0, p0, Lg5/c;->b:Landroid/app/DownloadManager;

    .line 27
    .line 28
    new-instance v0, Lorg/json/JSONObject;

    .line 29
    .line 30
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object v0, p0, Lg5/c;->c:Lorg/json/JSONObject;

    .line 34
    .line 35
    const-wide/16 v0, -0xb

    .line 36
    .line 37
    iput-wide v0, p0, Lg5/c;->e:J

    .line 38
    .line 39
    iget-object v0, p1, LR4/k1;->S:Lg5/h;

    .line 40
    .line 41
    invoke-virtual {v0}, Lg5/h;->h()V

    .line 42
    .line 43
    .line 44
    iget-object p1, p1, LR4/k1;->k:Landroid/webkit/WebView;

    .line 45
    .line 46
    if-eqz p1, :cond_0

    .line 47
    .line 48
    new-instance v0, Lg5/a;

    .line 49
    .line 50
    invoke-direct {v0, p0}, Lg5/a;-><init>(Lg5/c;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1, v0}, Landroid/webkit/WebView;->setDownloadListener(Landroid/webkit/DownloadListener;)V

    .line 54
    .line 55
    .line 56
    :cond_0
    return-void
.end method
