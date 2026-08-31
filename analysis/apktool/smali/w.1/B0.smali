.class public final Lw/B0;
.super Ls5/c;
.source "SourceFile"


# instance fields
.field public q:Lw/H0;

.field public r:Lkotlin/jvm/internal/x;

.field public synthetic s:Ljava/lang/Object;

.field public final synthetic t:Lw/H0;

.field public u:I


# direct methods
.method public constructor <init>(Lw/H0;Ls5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lw/B0;->t:Lw/H0;

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
    iput-object p1, p0, Lw/B0;->s:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lw/B0;->u:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lw/B0;->u:I

    .line 9
    .line 10
    iget-object p1, p0, Lw/B0;->t:Lw/H0;

    .line 11
    .line 12
    const-wide/16 v0, 0x0

    .line 13
    .line 14
    invoke-virtual {p1, v0, v1, p0}, Lw/H0;->b(JLs5/c;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1
.end method
