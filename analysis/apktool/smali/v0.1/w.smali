.class public final Lv0/w;
.super Ls5/c;
.source "SourceFile"


# instance fields
.field public q:LM5/B;

.field public synthetic r:Ljava/lang/Object;

.field public final synthetic s:Lv0/y;

.field public t:I


# direct methods
.method public constructor <init>(Lv0/y;Ls5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lv0/w;->s:Lv0/y;

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
    .locals 3

    .line 1
    iput-object p1, p0, Lv0/w;->r:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lv0/w;->t:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lv0/w;->t:I

    .line 9
    .line 10
    const-wide/16 v0, 0x0

    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    iget-object v2, p0, Lv0/w;->s:Lv0/y;

    .line 14
    .line 15
    invoke-virtual {v2, v0, v1, p1, p0}, Lv0/y;->h(JLB5/e;Ls5/c;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    return-object p1
.end method
