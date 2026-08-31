.class public final LF/G;
.super Ls5/c;
.source "SourceFile"


# instance fields
.field public q:LF/N;

.field public r:Lu/f0;

.field public s:I

.field public synthetic t:Ljava/lang/Object;

.field public final synthetic u:LF/N;

.field public v:I


# direct methods
.method public constructor <init>(LF/N;Ls5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LF/G;->u:LF/N;

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
    iput-object p1, p0, LF/G;->t:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, LF/G;->v:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, LF/G;->v:I

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    const/4 v0, 0x0

    .line 12
    iget-object v1, p0, LF/G;->u:LF/N;

    .line 13
    .line 14
    invoke-virtual {v1, p1, v0, p0}, LF/N;->f(ILu/f0;Ls5/c;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1
.end method
