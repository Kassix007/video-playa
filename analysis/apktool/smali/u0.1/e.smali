.class public final Lu0/e;
.super Ls5/c;
.source "SourceFile"


# instance fields
.field public q:Lu0/g;

.field public r:J

.field public s:J

.field public synthetic t:Ljava/lang/Object;

.field public final synthetic u:Lu0/g;

.field public v:I


# direct methods
.method public constructor <init>(Lu0/g;Ls5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lu0/e;->u:Lu0/g;

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
    iput-object p1, p0, Lu0/e;->t:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lu0/e;->v:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lu0/e;->v:I

    .line 9
    .line 10
    const-wide/16 v1, 0x0

    .line 11
    .line 12
    const-wide/16 v3, 0x0

    .line 13
    .line 14
    iget-object v0, p0, Lu0/e;->u:Lu0/g;

    .line 15
    .line 16
    move-object v5, p0

    .line 17
    invoke-virtual/range {v0 .. v5}, Lu0/g;->n(JJLq5/c;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    return-object p1
.end method
