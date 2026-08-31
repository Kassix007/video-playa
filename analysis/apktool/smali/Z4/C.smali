.class public final synthetic LZ4/C;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/media/MediaPlayer$OnErrorListener;


# instance fields
.field public final synthetic a:LZ4/M;


# direct methods
.method public synthetic constructor <init>(LZ4/M;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LZ4/C;->a:LZ4/M;

    return-void
.end method


# virtual methods
.method public final onError(Landroid/media/MediaPlayer;II)Z
    .locals 0

    .line 1
    iget-object p1, p0, LZ4/C;->a:LZ4/M;

    .line 2
    .line 3
    const/4 p2, 0x0

    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    invoke-virtual {p1, p2}, LZ4/M;->c(Z)V

    .line 7
    .line 8
    .line 9
    :cond_0
    if-eqz p1, :cond_1

    .line 10
    .line 11
    const-string p3, ""

    .line 12
    .line 13
    invoke-virtual {p1, p3}, LZ4/M;->d(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :cond_1
    return p2
.end method
