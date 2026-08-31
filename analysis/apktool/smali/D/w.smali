.class public final LD/w;
.super Ls5/c;
.source "SourceFile"


# instance fields
.field public q:LD/y;

.field public r:Lv/W;

.field public s:Ls5/i;

.field public synthetic t:Ljava/lang/Object;

.field public final synthetic u:LD/y;

.field public v:I


# direct methods
.method public constructor <init>(LD/y;Ls5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LD/w;->u:LD/y;

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
    iput-object p1, p0, LD/w;->t:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, LD/w;->v:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, LD/w;->v:I

    .line 9
    .line 10
    iget-object p1, p0, LD/w;->u:LD/y;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p1, v0, v0, p0}, LD/y;->e(Lv/W;LB5/e;Ls5/c;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method
