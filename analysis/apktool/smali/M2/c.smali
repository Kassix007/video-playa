.class public final LM2/c;
.super Ls5/c;
.source "SourceFile"


# instance fields
.field public q:LU2/g;

.field public r:Ljava/lang/Object;

.field public s:Ljava/lang/Object;

.field public t:Lkotlin/jvm/internal/y;

.field public u:Lkotlin/jvm/internal/y;

.field public v:Lkotlin/jvm/internal/y;

.field public w:Lkotlin/jvm/internal/y;

.field public synthetic x:Ljava/lang/Object;

.field public final synthetic y:LM2/h;

.field public z:I


# direct methods
.method public constructor <init>(LM2/h;Ls5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LM2/c;->y:LM2/h;

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
    iput-object p1, p0, LM2/c;->x:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, LM2/c;->z:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, LM2/c;->z:I

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    const/4 v4, 0x0

    .line 12
    iget-object v0, p0, LM2/c;->y:LM2/h;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    const/4 v2, 0x0

    .line 16
    move-object v5, p0

    .line 17
    invoke-static/range {v0 .. v5}, LM2/h;->b(LM2/h;LU2/g;Ljava/lang/Object;LU2/n;LI2/i;Ls5/c;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    return-object p1
.end method
