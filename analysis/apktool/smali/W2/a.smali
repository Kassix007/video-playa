.class public abstract LW2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lq6/j;

.field public static final b:Lq6/j;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lq6/j;->t:Lq6/j;

    .line 2
    .line 3
    const-string v0, "<svg"

    .line 4
    .line 5
    invoke-static {v0}, LO3/B;->h(Ljava/lang/String;)Lq6/j;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, LW2/a;->a:Lq6/j;

    .line 10
    .line 11
    const-string v0, "<"

    .line 12
    .line 13
    invoke-static {v0}, LO3/B;->h(Ljava/lang/String;)Lq6/j;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, LW2/a;->b:Lq6/j;

    .line 18
    .line 19
    return-void
.end method
