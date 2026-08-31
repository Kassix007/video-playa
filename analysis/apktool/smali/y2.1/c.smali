.class public final Ly2/c;
.super Ls5/c;
.source "SourceFile"


# instance fields
.field public A:I

.field public q:Ly2/i;

.field public r:LD2/j;

.field public s:Ljava/lang/Object;

.field public t:Ljava/lang/Object;

.field public u:Lkotlin/jvm/internal/y;

.field public v:Lkotlin/jvm/internal/y;

.field public w:Lkotlin/jvm/internal/y;

.field public x:Lkotlin/jvm/internal/y;

.field public synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ly2/i;


# direct methods
.method public constructor <init>(Ly2/i;Ls5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ly2/c;->z:Ly2/i;

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
    .locals 6

    .line 1
    iput-object p1, p0, Ly2/c;->y:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Ly2/c;->A:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Ly2/c;->A:I

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    const/4 v4, 0x0

    .line 12
    iget-object v0, p0, Ly2/c;->z:Ly2/i;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    const/4 v2, 0x0

    .line 16
    move-object v5, p0

    .line 17
    invoke-static/range {v0 .. v5}, Ly2/i;->b(Ly2/i;LD2/j;Ljava/lang/Object;LD2/n;Lt2/c;Ls5/c;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    return-object p1
.end method
