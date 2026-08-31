.class public final Li6/g;
.super Ld6/w;
.source "SourceFile"


# instance fields
.field public final q:Ljava/lang/String;

.field public final r:J

.field public final s:Lq6/A;


# direct methods
.method public constructor <init>(Ljava/lang/String;JLq6/A;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Li6/g;->q:Ljava/lang/String;

    .line 5
    .line 6
    iput-wide p2, p0, Li6/g;->r:J

    .line 7
    .line 8
    iput-object p4, p0, Li6/g;->s:Lq6/A;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final O()Lq6/i;
    .locals 1

    .line 1
    iget-object v0, p0, Li6/g;->s:Lq6/A;

    .line 2
    .line 3
    return-object v0
.end method

.method public final a()J
    .locals 2

    .line 1
    iget-wide v0, p0, Li6/g;->r:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final b()Ld6/p;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Li6/g;->q:Ljava/lang/String;

    .line 3
    .line 4
    if-eqz v1, :cond_0

    .line 5
    .line 6
    sget-object v2, Ld6/p;->b:Ljava/util/regex/Pattern;

    .line 7
    .line 8
    :try_start_0
    invoke-static {v1}, Lcom/google/android/gms/internal/measurement/n2;->o(Ljava/lang/String;)Ld6/p;

    .line 9
    .line 10
    .line 11
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    :catch_0
    :cond_0
    return-object v0
.end method
