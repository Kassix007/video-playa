.class public final LQ2/p;
.super Ls5/c;
.source "SourceFile"


# instance fields
.field public q:Ljava/lang/Object;

.field public r:LQ2/u;

.field public s:Lk3/c;

.field public synthetic t:Ljava/lang/Object;

.field public final synthetic u:LQ2/q;

.field public v:I


# direct methods
.method public constructor <init>(LQ2/q;Ls5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LQ2/p;->u:LQ2/q;

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
    .locals 1

    .line 1
    iput-object p1, p0, LQ2/p;->t:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, LQ2/p;->v:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, LQ2/p;->v:I

    .line 9
    .line 10
    iget-object p1, p0, LQ2/p;->u:LQ2/q;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-static {p1, v0, v0, v0, p0}, LQ2/q;->c(LQ2/q;LK2/h;LQ2/u;LQ2/u;Ls5/c;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method
