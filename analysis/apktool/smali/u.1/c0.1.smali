.class public final Lu/c0;
.super Ls5/c;
.source "SourceFile"


# instance fields
.field public q:Lu/d0;

.field public r:Ljava/lang/Object;

.field public synthetic s:Ljava/lang/Object;

.field public final synthetic t:Lu/d0;

.field public u:I


# direct methods
.method public constructor <init>(Lu/d0;Ls5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lu/c0;->t:Lu/d0;

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
    iput-object p1, p0, Lu/c0;->s:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lu/c0;->u:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lu/c0;->u:I

    .line 9
    .line 10
    iget-object p1, p0, Lu/c0;->t:Lu/d0;

    .line 11
    .line 12
    invoke-static {p1, p0}, Lu/d0;->t(Lu/d0;Ls5/c;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
.end method
