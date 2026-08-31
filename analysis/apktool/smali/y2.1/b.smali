.class public final Ly2/b;
.super Ls5/c;
.source "SourceFile"


# instance fields
.field public A:I

.field public q:Ly2/i;

.field public r:Lx2/m;

.field public s:Lt2/b;

.field public t:LD2/j;

.field public u:Ljava/lang/Object;

.field public v:LD2/n;

.field public w:Lt2/c;

.field public x:I

.field public synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ly2/i;


# direct methods
.method public constructor <init>(Ly2/i;Ls5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ly2/b;->z:Ly2/i;

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
    .locals 8

    .line 1
    iput-object p1, p0, Ly2/b;->y:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Ly2/b;->A:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Ly2/b;->A:I

    .line 9
    .line 10
    const/4 v5, 0x0

    .line 11
    const/4 v6, 0x0

    .line 12
    iget-object v0, p0, Ly2/b;->z:Ly2/i;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    const/4 v2, 0x0

    .line 16
    const/4 v3, 0x0

    .line 17
    const/4 v4, 0x0

    .line 18
    move-object v7, p0

    .line 19
    invoke-static/range {v0 .. v7}, Ly2/i;->a(Ly2/i;Lx2/m;Lt2/b;LD2/j;Ljava/lang/Object;LD2/n;Lt2/c;Ls5/c;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    return-object p1
.end method
