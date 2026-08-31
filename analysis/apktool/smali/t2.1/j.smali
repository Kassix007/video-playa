.class public final Lt2/j;
.super Ls5/c;
.source "SourceFile"


# instance fields
.field public q:Lt2/l;

.field public r:LD2/q;

.field public s:LD2/j;

.field public t:Lt2/c;

.field public u:Landroid/graphics/Bitmap;

.field public synthetic v:Ljava/lang/Object;

.field public final synthetic w:Lt2/l;

.field public x:I


# direct methods
.method public constructor <init>(Lt2/l;Ls5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lt2/j;->w:Lt2/l;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Ls5/c;-><init>(Lq5/c;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iput-object p1, p0, Lt2/j;->v:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lt2/j;->x:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lt2/j;->x:I

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    const/4 v0, 0x0

    .line 12
    iget-object v1, p0, Lt2/j;->w:Lt2/l;

    .line 13
    .line 14
    invoke-static {v1, p1, v0, p0}, Lt2/l;->a(Lt2/l;LD2/j;ILs5/c;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1
.end method
